package me.motemere.code;

import me.motemere.code.utils.Writer;

public class HelloWorld {

  public static void main(String[] args) {
    Writer writer = new Writer() {
    };

    writer.writeLine(String.format("Hello, World from '%s' and special thx for Robert W. Lafore.",
        HelloWorld.class));
  }
}
