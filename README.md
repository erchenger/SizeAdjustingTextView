SizeAdjustingTextView
=====================

This is based on an open source autosizing textview for Android.

## Usage
To use the SizeAdjustingTextView make sure you have the custom view in somewhere in your project.
From there when using XML Layouts you can simply use the <b>com.some.package.name.AutoAdjustingTextView</b>
widget and thats it. From there you need to make sure that you set a text size as the baseline for the view. 

```XML
<com.elliott.chenger.sizeadjustingtextview.view.SizeAdjustingTextView
        android:layout_width="fill_parent"
        android:layout_height="100dp"
        android:id="@+id/topBox"
        android:text="@string/hello_world"
        android:layout_below="@id/text_input"
        android:gravity="center"
        android:padding="0dp"
        android:textSize="60sp" />
```
