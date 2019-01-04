# Android Runtime Permission
This sample app with showing the way how to implement request Android Runtime Permission

#  Android Runtime Permission

## Getting Started
This sample app with showing the way how to implement request Android Runtime Permission

## Installing

We can install this library by using gradle

Step 1

```
allprojects {
	repositories {
			maven { url 'https://jitpack.io' }
		}
	}
```

Step 2

```
dependencies {
	         implementation 'com.github.androidawesome:androidruntimepermission:v1.0.2'
	}
```

## Sample Using

```
class MainActivity : AppCompatActivity() {

    private val mCameraRequestCode = 500

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        onCheckCameraRuntimePermission(mCameraRequestCode)
    }

    private fun onCheckCameraRuntimePermission(cameraCode: Int) {
        if ((ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED)
                and (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED)) {
            Toast.makeText(this, "Permission Granted!", Toast.LENGTH_SHORT).show()
        } else {
            AndroidRuntimePermission.onRequestRuntimePermissions(this, cameraCode,
                    arrayOf(Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE))
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        when (requestCode) {
            mCameraRequestCode -> {
                if ((grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
                    Toast.makeText(this, "Permission Granted!", Toast.LENGTH_SHORT).show()
                }
                return
            }
            else -> {
                super.onRequestPermissionsResult(requestCode, permissions, grantResults)
            }
        }
    }
}
    
```

## Min SDK Version

```
Support Min Sdk version >= 23

```

## Authors

* **AndroidAwesome** - [AndroidAwesome](https://github.com/androidawesome)

See also the list of [contributors](https://github.com/androidawesome/androidruntimepermission/graphs/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](https://github.com/androidawesome/androidruntimepermission/blob/master/README.md) file for details
