.class public input
.super java/lang/Object
.field public static count I
.method public static main([Ljava/lang/String;)V
.limit stack 10
.limit locals 100
ldc 5
istore 0
iload 0
putstatic input/count I
ldc 4
istore 1
for0:
goto test_for0
enter_for0:
getstatic input/count I
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
getstatic input/count I
istore 3
iinc 3 +1
iload 3
putstatic input/count I
goto for0
test_for0:
getstatic input/count I
istore 4
iload 4
iload 1
if_icmpge continue0
goto enter_for0
continue0:
return
.end method
