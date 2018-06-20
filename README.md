# OS-RW
A OS simulator to solve readers and writers problems.
This simulator based on the below conditions.
#####1.If one reader is reading the file,other readers also  can read the same file.
#####2.If one writer is writing the file,other writers can't write and other readers can't read at the same time.
#####3.When read request and write request exist at the same time,if write operation doesn't start,it will execute read operation first.This mean the write operation will start after all the read requests are finished.

