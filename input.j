.class public input
.super java/lang/Object
.field public static numero I
.method public static main([Ljava/lang/String;)V
.limit stack 10
.limit locals 100
ldc 5
istore 0
ldc 5
istore 1
iload 0
iload 1
imul
istore 2
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 2
invokevirtual java/io/PrintStream/println(I)V
return
.end method
