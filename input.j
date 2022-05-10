.class public input
.super java/lang/Object
.field public static num I
.method public static devolveInteiro(I)I
.limit stack 5
.limit locals 100
iload 0
iload 0
istore 0
iload 0
ireturn
.end method
.method public static main([Ljava/lang/String;)V
.limit stack 10
.limit locals 100
ldc 6
istore 1
ldc 6
istore 2
iload 1
iload 2
isub
istore 3
iload 3
invokestatic input.devolveInteiro(I)I
istore 4
iload 4
putstatic input/num I
getstatic input/num I
istore 5
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 5
invokevirtual java/io/PrintStream/print(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc ""
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return
.end method
