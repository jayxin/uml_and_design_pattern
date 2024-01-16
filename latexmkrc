# 加载 Time::HiRes 模块
#use Time::HiRes qw(gettimeofday tv_interval);
#use POSIX qw(floor);

# 记录开始时间
#my $start_time = [gettimeofday];

# 设置 pdflatex,xelatex,bibtex,biber 选项执行的命令
# %O, %S 是占位符;
# %O 代表选项，%S 代表对应命令的源文件
#$pdflatex = "pdflatex -shell-escape -file-line-error -halt-on-error -interaction=nonstopmode -synctex=1 %O %S";
$xelatex = "xelatex -shell-escape -file-line-error -halt-on-error -interaction=batchmode -no-pdf -synctex=0 %O %S";
#$lualatex = "lualatex -shell-escape -file-line-error -halt-on-error -interaction=nonstopmode -synctex=1 %O %S";

#$recorder = 1;

# 设置pdf生成模式，有 0 1 2 3 4 5
# 0 代表不生成 pdf
# 1 代表使用 $pdfltex 选项的命令，在系统 RC 文件已经设置
# 2 代表使用 $ps2pdf；
# 3 代表使用 $dvipdf；
# 4 代表使用 $lualatex；
# 5 代表使用 $xelatex，在系统 RC 文件已经设置
$pdf_mode = 5;

#$bibtex = "bibtex %O %S";
#$biber = "biber %O %S";

$xdvipdfmx = "xdvipdfmx -E -o %D %O %S";

# 编译索引
#$makeindex = "makeindex -s gind.ist %O -o %D %S";

# 用glossaries做索引，所需要的额外编译
#add_cus_dep('glo', 'gls', 0, 'glo2gls');
#sub glo2gls {
    #system("makeindex -s gglo.ist -o \"$_[0].gls\" \"$_[0].glo\"");
#}
#push @generated_exts, "glo", "gls";

# 用nomencl做索引，所需要的额外编译
#add_cus_dep('nlo', 'nls', 0, 'nlo2nls');
#sub nlo2nls {
    #system("makeindex -s nomencl.ist -o \"$_[0].nls\" \"$_[0].nlo\"");
#}
#push @generated_exts, "nlo", "nls";

# 执行 latexmk -c 或 latexmk -C 时会清空 latex 程序生成的文件（-C 更强，会清空pdf）
# 除此之外, 可以设置额外的文件拓展，以进行清空
#$clean_ext = "blg idx ind lof lot out toc acn acr alg glg glo gls ist fls log spl dtx nlo nls ilg glsdefs fdb_latexmk synctex synctex.gz spl";

# ================================================================================
# 编译结束后要执行的命令
# ================================================================================

#END {
    #use open qw(:std :utf8);
    #use strict;
    #use warnings;
    #use File::Copy 'move';
    #use File::Path 'rmtree';

    ## 指定目标文件夹名称
    #my $folder_name = 'Build';

    ## 打印执行信息
    #print "================================================================================\n";
    #print "XXXXXXXXXXXXXXXXXXXXXXXXXXXX 开始执行编译以外的附加命令！XXXXXXXXXXXXXXXXXXXXXXXXXXXX\n";
    #print "================================================================================\n";

    ## 使用文件测试符检查目标文件夹是否存在
    #if (-d $folder_name) {
        #print "$folder_name 文件夹已存在\n";
    #} else {
        ## 如果不存在，则创建目标文件夹
        #mkdir $folder_name or die "无法创建 $folder_name 文件夹: $!\n";
        #print "$folder_name 文件夹已创建\n";
    #}

    ## 移动以.pdf或.gz结尾的文件到目标文件夹
    #for my $file (glob "*.{pdf,gz}") {
        #move($file, $folder_name) or die "无法移动文件 $file: $!";
        #print "移动文件 $file 到 $folder_name 文件夹\n";
    #}

    ## 删除指定文件夹下的所有子文件夹
    #for my $subfolder (glob "$folder_name/*/") {
        #rmtree($subfolder) or warn "无法删除文件夹 $subfolder: $!";
        #print "文件夹 $subfolder 已成功删除\n";
    #}

    ## 格式化时间格式
    #my $elapsed = tv_interval($start_time);
    #my $hours = floor($elapsed / 3600);
    #my $minutes = floor(($elapsed % 3600) / 60);
    #my $seconds = $elapsed % 60;
    #print "================================================================================\n";
    #print "编译时长为：" . sprintf("%02d 小时 %02d 分 %02d 秒 ", $hours, $minutes, $seconds) . "总计 $seconds 秒\n";
#}

# 设置 bibtex 或 biber 的使用规则，有 0 1 1.5 2
# 0: 不使用 bibtex 或 biber； 清空的时候不会清空 .bbl 文件
# 1: 只有 bib 文件存在才使用 bibtex 或 biber；清空的时候不会清空 .bbl 文件
# 1.5: 只有 bib 文件存在才使用 bibtex 或 biber；当 bib 文件存在时会清空 bbl，否则不会清空
# 2: 有必要更新bbl文件时，运行 bibtex 或 biber，无需测试 bib 文件存在与否；清空删除 bbl
#$bibtex_use = 1.5;

# 设置 latex 文件输出的目录
# $out_dir = "Build";

# 设置 latexmk 编译的文件，和不需要编译的文件，可以时多个
# @default_files = ("main.tex");
# @default_excluded_files = ();
#$"latexmk -c" # 由于使用latex workshop进行后清理，因此注销该命令

# $view 设置预览的文件格式
$view = "pdf";

#$preview_continuous_mode = 1;
# 设置预览模式，相当于 -pv 选项，在编译结束会开启预览
$preview_mode = 1;

$pdf_previewer="zathura %O %S";
