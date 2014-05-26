package com.elliott.chenger.sizeadjustingtextview.utils;

import com.elliott.chenger.sizeadjustingtextview.view.SizeAdjustingTextView;

public class TextMover {

	public static void moveTextFromCellToCell(SizeAdjustingTextView startingCell,
			SizeAdjustingTextView endCell){
		if(!startingCell.getText().toString().isEmpty()){
			String text = startingCell.getText().toString();
			endCell.setText(text);
		}
	}
	
	public static void moveNewTextIntoCell(SizeAdjustingTextView targetCell,
			String text){
		targetCell.setText(text);
	}
}
