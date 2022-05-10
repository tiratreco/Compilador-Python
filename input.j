.class public input
.super java/lang/Object
.field public static num I
.field public static pow I
.method public static mult(II)I
.limit stack 5
.limit locals 100

iload 0
istore 2

iload 1
istore 3

iload 2
iload 3

imul
istore 4
iload 4
ireturn
.end method
.method public static main([Ljava/lang/String;)V
.limit stack 10
.limit locals 100
ldc 5
istore 5
ldc 5
istore 6
iload 5
iload 6
imul
istore 7
ldc 3
istore 8
iload 7
iload 8
isub
istore 9
iload 9
putstatic input/num I
getstatic input/num I
istore 10
ldc 5
istore 11
iload 10
iload 11
invokestatic input.mult(II)I
istore 12
iload 12
putstatic input/pow I
getstatic input/pow I
istore 13
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 13
invokevirtual java/io/PrintStream/print(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc ""
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return
.end method
