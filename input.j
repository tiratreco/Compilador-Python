.class public input
.super java/lang/Object
.field public static val Z
.method public static main([Ljava/lang/String;)V
.limit stack 10
.limit locals 100
ldc 1
istore 0
ldc 1
istore 1
iload 0
iload 1
if_icmpge true0
ldc 0
goto cmp_end0
true0:
ldc 1
cmp_end0:
istore 2
iload 2
putstatic input/val Z
getstatic input/val Z
istore 3
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 3
invokevirtual java/io/PrintStream/print(Z)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc ""
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return
.end method
