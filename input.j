.class public input
.super java/lang/Object
.field public static cinco I
.method public static numeroCinco()I
.limit stack 5
.limit locals 100
ldc 5
istore 0
iload 0
ireturn
.end method
.method public static main([Ljava/lang/String;)V
.limit stack 10
.limit locals 100
invokestatic input.numeroCinco()I
istore 1
iload 1
putstatic input/cinco I
getstatic input/cinco I
istore 2
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 2
invokevirtual java/io/PrintStream/print(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc ""
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return
.end method
