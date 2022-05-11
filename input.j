.class public input
.super java/lang/Object
.field public static val Z
.method public static main([Ljava/lang/String;)V
.limit stack 10
.limit locals 100
ldc 1
istore 0
iload 0
putstatic input/val Z
ldc 1
istore 1
iload 1
ldc 1
ixor
istore 2

iload 1
istore 3

iload 2
invokevirtual java/io/PrintStream/print(Z)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc ""
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return
.end method
