import csv

with open("stats - stats.csv","r", encoding="utf-8") as old_file:
    reader = csv.reader(old_file)

    with open("output.csv","w", encoding="utf-8",newline='') as new_file:
        writer = csv.writer(new_file)
        
        for line in reader: 
            nation_line = line[2].split(' ')
            nation_line.pop(0)
            if nation_line:
                line.pop(2)
                line.insert(2,nation_line[0])
            writer.writerow(line[1:])

