mvn clean package;
declare -i i=1
for file in $(ls)
do
    if [ -d $file ]; then
       echo 第$i个题目：;
       let i++;
       java -jar $file/target/*.jar;
     fi
done
