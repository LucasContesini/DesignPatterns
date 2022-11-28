package com.contesini.designpatterns.behavioralpatterns.command.commands;

import com.contesini.designpatterns.behavioralpatterns.command.editor.Editor;

public class CopyCommand extends Command {

  public CopyCommand(Editor editor) {
    super(editor);
  }

  @Override
  public boolean execute() {
    editor.clipboard = editor.textField.getSelectedText();
    return false;
  }
}
