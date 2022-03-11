for file in test-files/*.md;
do
    java MarkdownParse $file >> results.txt
    echo "$file" >> results.txt
done