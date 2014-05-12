SizeAdjustingTextView
=====================

This is based on an open source autosizing textview for Android I found a few weeks ago. The initial approach
didn't resize multiple lines and wasn't maintained to keep up with changes in Android. I decided to go ahead
and create this as a place to preserve the auto sizing text view as well as giving it a platform for some change
and to possibly add some features and functionality.

## Usage
To use the SizeAdjustingTextView make sure you have the custom view somewhere in your project.
From there when using XML Layouts you can simply use the <b>com.some.package.name.SizeAdjustingTextView</b>
widget and thats it. From there you need to make sure that you set a text size as the baseline for the view. 
```XML
<com.example.sizeadjustingtextview.view.SizeAdjustingTextView
        android:layout_width="fill_parent"
        android:layout_height="100dp"
        android:id="@+id/topBox"
        android:layout_below="@id/text_input"
        android:gravity="center"
        android:padding="0dp"
        android:textSize="60sp" />
```
Lastly when using custom views in XML, make sure you have the XLMNS tag in the root of the layout tag. 
```XML
 xmlns:app="http://schemas.android.com/apk/res/com.example.SizeAdjustingTextView"
```

I didn't want to make this a library because there is no need for adding a library for one view. Just port over the SizeAdjustingTextView and you should be good. 



