package io.elevenlabs.data.worker;

import androidx.room.m0;
import com.google.protobuf.c6;
import ho.l;
import ho.p;
import ir.j;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import sn.k;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.data.worker.OfflineReadsDownloaderKt$writeToFile$2", f = "OfflineReadsDownloader.kt", l = {526, 532}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lir/j;", "", "Lsn/z;", "<anonymous>", "(Lir/j;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class OfflineReadsDownloaderKt$writeToFile$2 extends i implements p {
    final /* synthetic */ File $file;
    final /* synthetic */ l $onCancel;
    final /* synthetic */ ir.i $this_writeToFile;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineReadsDownloaderKt$writeToFile$2(File file, ir.i iVar, l lVar, c<? super OfflineReadsDownloaderKt$writeToFile$2> cVar) {
        super(2, cVar);
        this.$file = file;
        this.$this_writeToFile = iVar;
        this.$onCancel = lVar;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        OfflineReadsDownloaderKt$writeToFile$2 offlineReadsDownloaderKt$writeToFile$2 = new OfflineReadsDownloaderKt$writeToFile$2(this.$file, this.$this_writeToFile, this.$onCancel, cVar);
        offlineReadsDownloaderKt$writeToFile$2.L$0 = obj;
        return offlineReadsDownloaderKt$writeToFile$2;
    }

    @Override // ho.p
    public final Object invoke(j jVar, c<? super z> cVar) {
        return ((OfflineReadsDownloaderKt$writeToFile$2) create(jVar, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x003f: MOVE (r1 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:64), block:B:41:0x003f */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        final FileOutputStream fileOutputStream;
        int i10;
        Exception exc;
        l lVar;
        Closeable closeable;
        final j jVar = (j) this.L$0;
        ?? r12 = this.label;
        xn.a aVar = xn.a.f37986a;
        try {
            try {
                if (r12 != 0) {
                    if (r12 != 1) {
                        if (r12 != 2) {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Exception exc2 = (Exception) this.L$3;
                        sn.a.g(obj);
                        throw exc2;
                    }
                    int i11 = this.I$0;
                    fileOutputStream = (FileOutputStream) this.L$3;
                    lVar = (l) this.L$2;
                    closeable = (Closeable) this.L$1;
                    try {
                        sn.a.g(obj);
                    } catch (Exception e10) {
                        i10 = i11;
                        exc = e10;
                        fileOutputStream.close();
                        this.L$0 = null;
                        this.L$1 = closeable;
                        this.L$2 = null;
                        this.L$3 = exc;
                        this.I$0 = i10;
                        this.label = 2;
                        if (lVar.invoke(this) != aVar) {
                        }
                        return aVar;
                    }
                } else {
                    sn.a.g(obj);
                    fileOutputStream = new FileOutputStream(this.$file);
                    ir.i iVar = this.$this_writeToFile;
                    l lVar2 = this.$onCancel;
                    i10 = 0;
                    try {
                        j jVar2 = new j() { // from class: io.elevenlabs.data.worker.OfflineReadsDownloaderKt$writeToFile$2$1$1
                            public final Object emit(k kVar, c<? super z> cVar) {
                                byte[] bArr = (byte[]) kVar.f31600a;
                                float floatValue = ((Number) kVar.f31601b).floatValue();
                                fileOutputStream.write(bArr);
                                Object emit = jVar.emit(new Float(floatValue), cVar);
                                if (emit == xn.a.f37986a) {
                                    return emit;
                                }
                                return z.f31622a;
                            }

                            @Override // ir.j
                            public /* bridge */ /* synthetic */ Object emit(Object obj3, c cVar) {
                                return emit((k) obj3, (c<? super z>) cVar);
                            }
                        };
                        this.L$0 = null;
                        this.L$1 = fileOutputStream;
                        this.L$2 = lVar2;
                        this.L$3 = fileOutputStream;
                        this.I$0 = 0;
                        this.label = 1;
                        if (iVar.collect(jVar2, this) != aVar) {
                            closeable = fileOutputStream;
                        }
                    } catch (Exception e11) {
                        exc = e11;
                        lVar = lVar2;
                        closeable = fileOutputStream;
                        fileOutputStream.close();
                        this.L$0 = null;
                        this.L$1 = closeable;
                        this.L$2 = null;
                        this.L$3 = exc;
                        this.I$0 = i10;
                        this.label = 2;
                        if (lVar.invoke(this) != aVar) {
                            throw exc;
                        }
                        return aVar;
                    }
                    return aVar;
                }
                m0.o(closeable, null);
                return z.f31622a;
            } catch (Throwable th) {
                th = th;
                try {
                    throw th;
                } catch (Throwable th2) {
                    m0.o(r12, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            r12 = obj2;
            throw th;
        }
    }
}
