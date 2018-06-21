# OS-RW
A OS simulator to solve readers and writers problems.
This simulator based on the conditions below.

* ### 1.If one reader is reading the file,other readers also  can read the same file.
* ### 2.If one writer is writing the file,other writers can't write and other readers can't read at the same time.
* ### 3.When read request and write request exist at the same time,if write operation doesn't start,it will execute read operation first.This mean the write operation will start after all the read requests are finished.

## Test Result

### Situation 1

        readerThread1.start();
        readerThread2.start();
        readerThread3.start();
        writerThread1.start();
        writerThread2.start();
        writerThread3.start();
        
        Writer is ready to write.
        Writer is ready to write.
        Reader is ready to read.
        Writer is ready to write.
        Reader start to read.
        Reader is ready to read.
        Reader start to read.
        Reader is ready to read.
        Reader start to read.
        Reader finish reading.
        Reader finish reading.
        Reader finish reading.
        Writer start to write.
        Writer finish writing.
        Writer start to write.
        Writer finish writing.
        Writer start to write.
        Writer finish writing.


### Situation 2

        readerThread1.start();
        writerThread1.start();
        readerThread2.start();
        writerThread2.start();
        readerThread3.start();
        writerThread3.start();
        
        Writer is ready to write.
        Writer is ready to write.
        Writer is ready to write.
        Writer start to write.
        Reader is ready to read.
        Reader is ready to read.
        Reader is ready to read.
        Writer finish writing.
        Reader start to read.
        Reader start to read.
        Reader start to read.
        Reader finish reading.
        Reader finish reading.
        Reader finish reading.
        Writer start to write.
        Writer finish writing.
        Writer start to write.
        Writer finish writing.
        

### Situation 3

        writerThread1.start();
        readerThread1.start();
        writerThread2.start();
        readerThread2.start();
        writerThread3.start();
        readerThread3.start();        
        
        Writer is ready to write.
        Writer is ready to write.
        Writer is ready to write.
        Reader is ready to read.
        Reader is ready to read.
        Reader start to read.
        Reader is ready to read.
        Reader start to read.
        Reader start to read.
        Reader finish reading.
        Reader finish reading.
        Reader finish reading.
        Writer start to write.
        Writer finish writing.
        Writer start to write.
        Writer finish writing.
        Writer start to write.
        Writer finish writing.


### Situation 4

        writerThread1.start();
        writerThread2.start();
        writerThread3.start();
        readerThread1.start();
        readerThread2.start();
        readerThread3.start();
        
        Writer is ready to write.
        Writer is ready to write.
        Writer is ready to write.
        Writer start to write.
        Reader is ready to read.
        Reader is ready to read.
        Reader is ready to read.
        Writer finish writing.
        Reader start to read.
        Reader start to read.
        Reader start to read.
        Reader finish reading.
        Reader finish reading.
        Reader finish reading.
        Writer start to write.
        Writer finish writing.
        Writer start to write.
        Writer finish writing.
