SizeAdjustingTextView
=====================

This is based on an open source autosizing textview for Android I found a few weeks ago. The initial approach
didn't allow multiple lines and wasn't maintained to keep up with changes in Android. I decided to go ahead
and create this as a place to preserve the auto sizing text view as well as giving it a platform for some change
and to possibly add some features and functionality.

## Usage
To use the SizeAdjustingTextView make sure you have the custom view in somewhere in your project.
From there when using XML Layouts you can simply use the <b>com.some.package.name.SizeAdjustingTextView</b>
widget and thats it. From there you need to make sure that you set a text size as the baseline for the view. 

```XML
<com.elliott.chenger.sizeadjustingtextview.view.SizeAdjustingTextView
        android:layout_width="fill_parent"
        android:layout_height="100dp"
        android:id="@+id/topBox"
        android:layout_below="@id/text_input"
        android:gravity="center"
        android:padding="0dp"
        android:textSize="60sp" />
```
