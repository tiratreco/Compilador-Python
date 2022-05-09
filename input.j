.class public input
.super java/lang/Object
.field public static numero I
.method public static teste()I
.limit stack 5
.limit locals 100
ldc 3
ireturn
.end method
.method public static main([Ljava/lang/String;)V
.limit stack 10
.limit locals 100
ldc 1
istore 0
ldc 2.3
fstore 1
iload 0
i2f
fstore 2
fload 2
fload 1
fmul
fstore 3
fload 3
putstatic input/var F
getstatic input/var F
fstore 4
getstatic java/lang/System/out Ljava/io/PrintStream;
fload 4
invokevirtual java/io/PrintStream/print(F)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc ""
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return
.end method
