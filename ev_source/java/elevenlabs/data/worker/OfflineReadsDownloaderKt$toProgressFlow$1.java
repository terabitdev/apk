package io.elevenlabs.data.worker;

import androidx.room.m0;
import com.google.protobuf.c6;
import ho.p;
import ir.j;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import okhttp3.ResponseBody;
import sn.k;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.data.worker.OfflineReadsDownloaderKt$toProgressFlow$1", f = "OfflineReadsDownloader.kt", l = {506}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lir/j;", "Lsn/k;", "", "", "Lsn/z;", "<anonymous>", "(Lir/j;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class OfflineReadsDownloaderKt$toProgressFlow$1 extends i implements p {
    final /* synthetic */ int $bufferSize;
    final /* synthetic */ ResponseBody $this_toProgressFlow;
    float F$0;
    int I$0;
    long J$0;
    long J$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineReadsDownloaderKt$toProgressFlow$1(ResponseBody responseBody, int i10, c<? super OfflineReadsDownloaderKt$toProgressFlow$1> cVar) {
        super(2, cVar);
        this.$this_toProgressFlow = responseBody;
        this.$bufferSize = i10;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        OfflineReadsDownloaderKt$toProgressFlow$1 offlineReadsDownloaderKt$toProgressFlow$1 = new OfflineReadsDownloaderKt$toProgressFlow$1(this.$this_toProgressFlow, this.$bufferSize, cVar);
        offlineReadsDownloaderKt$toProgressFlow$1.L$0 = obj;
        return offlineReadsDownloaderKt$toProgressFlow$1;
    }

    @Override // ho.p
    public final Object invoke(j jVar, c<? super z> cVar) {
        return ((OfflineReadsDownloaderKt$toProgressFlow$1) create(jVar, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006d A[Catch: all -> 0x002d, TryCatch #1 {all -> 0x002d, blocks: (B:6:0x0027, B:9:0x0063, B:11:0x006d, B:14:0x0076, B:19:0x0072, B:26:0x0045, B:29:0x0050), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.jvm.internal.b0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00a7 -> B:8:0x00aa). Please report as a decompilation issue!!! */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InputStream inputStream;
        byte[] bArr;
        ?? obj2;
        int i10;
        long j4;
        long j10;
        InputStream inputStream2;
        int read;
        byte[] copyOf;
        j jVar = (j) this.L$0;
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    j10 = this.J$1;
                    j4 = this.J$0;
                    i10 = this.I$0;
                    b0 b0Var = (b0) this.L$4;
                    bArr = (byte[]) this.L$3;
                    inputStream = (InputStream) this.L$2;
                    ?? r11 = (Closeable) this.L$1;
                    sn.a.g(obj);
                    boolean z6 = true;
                    b0 b0Var2 = b0Var;
                    InputStream inputStream3 = r11;
                    obj2 = b0Var2;
                    inputStream2 = inputStream3;
                    read = inputStream.read(bArr);
                    obj2.f20557a = read;
                    if (read != -1) {
                        if (read == bArr.length) {
                            copyOf = bArr;
                        } else {
                            copyOf = Arrays.copyOf(bArr, read);
                        }
                        j10 += obj2.f20557a;
                        float f10 = ((float) j10) / ((float) j4);
                        k kVar = new k(copyOf, new Float(f10));
                        this.L$0 = jVar;
                        this.L$1 = inputStream2;
                        this.L$2 = inputStream;
                        this.L$3 = bArr;
                        this.L$4 = obj2;
                        this.L$5 = null;
                        this.I$0 = i10;
                        this.J$0 = j4;
                        this.J$1 = j10;
                        this.F$0 = f10;
                        z6 = true;
                        this.label = 1;
                        Object emit = jVar.emit(kVar, this);
                        xn.a aVar = xn.a.f37986a;
                        b0Var2 = obj2;
                        inputStream3 = inputStream2;
                        if (emit == aVar) {
                            return aVar;
                        }
                        obj2 = b0Var2;
                        inputStream2 = inputStream3;
                        read = inputStream.read(bArr);
                        obj2.f20557a = read;
                        if (read != -1) {
                        }
                    } else {
                        m0.o(inputStream2, null);
                        return z.f31622a;
                    }
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                sn.a.g(obj);
                InputStream a10 = this.$this_toProgressFlow.a();
                ResponseBody responseBody = this.$this_toProgressFlow;
                int i12 = this.$bufferSize;
                long f25671d = responseBody.getF25671d();
                if (f25671d < 1) {
                    f25671d = 1;
                }
                inputStream = a10;
                bArr = new byte[i12];
                obj2 = new Object();
                i10 = 0;
                j4 = f25671d;
                j10 = 0;
                inputStream2 = a10;
                read = inputStream.read(bArr);
                obj2.f20557a = read;
                if (read != -1) {
                }
            }
        } finally {
        }
    }
}
