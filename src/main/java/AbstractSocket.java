import java.io.IOException;

public abstract class AbstractSocket {

   public abstract void close();

   public abstract boolean isAvailable(int var1) throws IOException;

   public abstract int read(byte[] var1, int var2, int var3) throws IOException;

   public abstract void vmethod5829(byte[] var1, int var2, int var3, int var4) throws IOException;

   public abstract int vmethod5826(byte var1) throws IOException;

   public abstract int vmethod5825(byte var1) throws IOException;

}
