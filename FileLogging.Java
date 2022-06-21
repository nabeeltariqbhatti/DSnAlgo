 try{
            writeList();
            Handler handler = new FileHandler("OutFile.log");
            SimpleFormatter formatter = new SimpleFormatter();
            handler.setFormatter(formatter);
            Logger.getLogger(TWithR.class.getName()).addHandler(handler);
            throw new IOException("thrown");
        }catch (IOException|IndexOutOfBoundsException ex){
            Logger logger = Logger.getLogger(TWithR.class.getName());

            StackTraceElement elements[] = ex.getStackTrace();
            for (int i = 0, n = elements.length; i < n; i++) {
                logger.log(Level.WARNING, elements[i].getMethodName() + System.getProperty("line.separator"));
                logger.info("kjnckjewnckewndckjewnkjcwekc kjew ckjew dckwe dckjewckj ");
            }
        }

//from java docs, using core java
