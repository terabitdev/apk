package io.livekit.android.room.datastream.outgoing;

import com.google.protobuf.c6;
import fs.c0;
import fs.h;
import fs.l0;
import fs.n;
import fs.w;
import fs.y;
import hj.b;
import ho.p;
import java.io.File;
import java.io.InputStream;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.a;
import sn.l;
import sn.m;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087@¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0087@¢\u0006\u0004\b\u0005\u0010\t\u001a\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0087@¢\u0006\u0004\b\f\u0010\r\u001a\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0087@¢\u0006\u0004\b\f\u0010\u0010\"6\u0010\u0016\u001a$\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00140\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lio/livekit/android/room/datastream/outgoing/ByteStreamSender;", "Ljava/io/File;", "file", "Lsn/m;", "Lsn/z;", "writeFile", "(Lio/livekit/android/room/datastream/outgoing/ByteStreamSender;Ljava/io/File;Lwn/c;)Ljava/lang/Object;", "", "filePath", "(Lio/livekit/android/room/datastream/outgoing/ByteStreamSender;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Ljava/io/InputStream;", "input", "write", "(Lio/livekit/android/room/datastream/outgoing/ByteStreamSender;Ljava/io/InputStream;Lwn/c;)Ljava/lang/Object;", "Lfs/l0;", "source", "(Lio/livekit/android/room/datastream/outgoing/ByteStreamSender;Lfs/l0;Lwn/c;)Ljava/lang/Object;", "Lkotlin/Function2;", "", "", "", "Lio/livekit/android/room/datastream/outgoing/DataChunker;", "byteDataChunker", "Lho/p;", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ByteStreamSenderKt {
    private static final p byteDataChunker = ByteStreamSenderKt$byteDataChunker$1.INSTANCE;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b A[Catch: Exception -> 0x007e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x007e, blocks: (B:11:0x002d, B:14:0x0076, B:20:0x004e, B:25:0x005b), top: B:10:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0072 -> B:13:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object write(ByteStreamSender byteStreamSender, l0 l0Var, c<? super m> cVar) {
        ByteStreamSenderKt$write$2 byteStreamSenderKt$write$2;
        int i10;
        ByteStreamSender byteStreamSender2;
        h obj;
        l0 l0Var2;
        if (cVar instanceof ByteStreamSenderKt$write$2) {
            byteStreamSenderKt$write$2 = (ByteStreamSenderKt$write$2) cVar;
            int i11 = byteStreamSenderKt$write$2.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                byteStreamSenderKt$write$2.label = i11 - Integer.MIN_VALUE;
                Object obj2 = byteStreamSenderKt$write$2.result;
                i10 = byteStreamSenderKt$write$2.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        obj = (h) byteStreamSenderKt$write$2.L$2;
                        l0 l0Var3 = (l0) byteStreamSenderKt$write$2.L$1;
                        ByteStreamSender byteStreamSender3 = (ByteStreamSender) byteStreamSenderKt$write$2.L$0;
                        try {
                            a.g(obj2);
                            Object obj3 = ((m) obj2).f31603a;
                            ByteStreamSenderKt$write$2 byteStreamSenderKt$write$22 = byteStreamSenderKt$write$2;
                            l0 l0Var4 = l0Var3;
                            byteStreamSender2 = byteStreamSender3;
                            ByteStreamSenderKt$write$2 byteStreamSenderKt$write$23 = byteStreamSenderKt$write$22;
                            if (!(obj3 instanceof l)) {
                                return obj3;
                            }
                            l0Var2 = l0Var4;
                            byteStreamSenderKt$write$2 = byteStreamSenderKt$write$23;
                            if (l0Var2.M(obj, 4096L) != -1) {
                                return z.f31622a;
                            }
                            byte[] g02 = obj.g0(obj.f9973b);
                            byteStreamSenderKt$write$2.L$0 = byteStreamSender2;
                            byteStreamSenderKt$write$2.L$1 = l0Var2;
                            byteStreamSenderKt$write$2.L$2 = obj;
                            byteStreamSenderKt$write$2.label = 1;
                            Object m2556writegIAlus = byteStreamSender2.m2556writegIAlus(g02, byteStreamSenderKt$write$2);
                            xn.a aVar = xn.a.f37986a;
                            if (m2556writegIAlus == aVar) {
                                return aVar;
                            }
                            byteStreamSenderKt$write$22 = byteStreamSenderKt$write$2;
                            l0Var4 = l0Var2;
                            obj3 = m2556writegIAlus;
                            ByteStreamSenderKt$write$2 byteStreamSenderKt$write$232 = byteStreamSenderKt$write$22;
                            if (!(obj3 instanceof l)) {
                            }
                        } catch (Exception e10) {
                            return new l(e10);
                        }
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    a.g(obj2);
                    byteStreamSender2 = byteStreamSender;
                    obj = new Object();
                    l0Var2 = l0Var;
                    if (l0Var2.M(obj, 4096L) != -1) {
                    }
                }
            }
        }
        byteStreamSenderKt$write$2 = new ByteStreamSenderKt$write$2(cVar);
        Object obj22 = byteStreamSenderKt$write$2.result;
        i10 = byteStreamSenderKt$write$2.label;
        if (i10 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object writeFile(ByteStreamSender byteStreamSender, File file, c<? super m> cVar) {
        ByteStreamSenderKt$writeFile$1 byteStreamSenderKt$writeFile$1;
        int i10;
        if (cVar instanceof ByteStreamSenderKt$writeFile$1) {
            byteStreamSenderKt$writeFile$1 = (ByteStreamSenderKt$writeFile$1) cVar;
            int i11 = byteStreamSenderKt$writeFile$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                byteStreamSenderKt$writeFile$1.label = i11 - Integer.MIN_VALUE;
                Object obj = byteStreamSenderKt$writeFile$1.result;
                i10 = byteStreamSenderKt$writeFile$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        a.g(obj);
                        return ((m) obj).f31603a;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a.g(obj);
                y yVar = n.f9989a;
                String str = c0.f9934b;
                c0 w6 = b.w(file);
                yVar.getClass();
                w h10 = fs.b.h(w6.toFile());
                byteStreamSenderKt$writeFile$1.label = 1;
                Object write = write(byteStreamSender, h10, byteStreamSenderKt$writeFile$1);
                xn.a aVar = xn.a.f37986a;
                if (write == aVar) {
                    return aVar;
                }
                return write;
            }
        }
        byteStreamSenderKt$writeFile$1 = new ByteStreamSenderKt$writeFile$1(cVar);
        Object obj2 = byteStreamSenderKt$writeFile$1.result;
        i10 = byteStreamSenderKt$writeFile$1.label;
        if (i10 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object writeFile(ByteStreamSender byteStreamSender, String str, c<? super m> cVar) {
        ByteStreamSenderKt$writeFile$2 byteStreamSenderKt$writeFile$2;
        int i10;
        if (cVar instanceof ByteStreamSenderKt$writeFile$2) {
            byteStreamSenderKt$writeFile$2 = (ByteStreamSenderKt$writeFile$2) cVar;
            int i11 = byteStreamSenderKt$writeFile$2.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                byteStreamSenderKt$writeFile$2.label = i11 - Integer.MIN_VALUE;
                Object obj = byteStreamSenderKt$writeFile$2.result;
                i10 = byteStreamSenderKt$writeFile$2.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        a.g(obj);
                        return ((m) obj).f31603a;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a.g(obj);
                y yVar = n.f9989a;
                String str2 = c0.f9934b;
                c0 v9 = b.v(str);
                yVar.getClass();
                w h10 = fs.b.h(v9.toFile());
                byteStreamSenderKt$writeFile$2.label = 1;
                Object write = write(byteStreamSender, h10, byteStreamSenderKt$writeFile$2);
                xn.a aVar = xn.a.f37986a;
                return write == aVar ? aVar : write;
            }
        }
        byteStreamSenderKt$writeFile$2 = new ByteStreamSenderKt$writeFile$2(cVar);
        Object obj2 = byteStreamSenderKt$writeFile$2.result;
        i10 = byteStreamSenderKt$writeFile$2.label;
        if (i10 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object write(ByteStreamSender byteStreamSender, InputStream inputStream, c<? super m> cVar) {
        ByteStreamSenderKt$write$1 byteStreamSenderKt$write$1;
        int i10;
        if (cVar instanceof ByteStreamSenderKt$write$1) {
            byteStreamSenderKt$write$1 = (ByteStreamSenderKt$write$1) cVar;
            int i11 = byteStreamSenderKt$write$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                byteStreamSenderKt$write$1.label = i11 - Integer.MIN_VALUE;
                Object obj = byteStreamSenderKt$write$1.result;
                i10 = byteStreamSenderKt$write$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        a.g(obj);
                        return ((m) obj).f31603a;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a.g(obj);
                w i12 = fs.b.i(inputStream);
                byteStreamSenderKt$write$1.label = 1;
                Object write = write(byteStreamSender, i12, byteStreamSenderKt$write$1);
                xn.a aVar = xn.a.f37986a;
                return write == aVar ? aVar : write;
            }
        }
        byteStreamSenderKt$write$1 = new ByteStreamSenderKt$write$1(cVar);
        Object obj2 = byteStreamSenderKt$write$1.result;
        i10 = byteStreamSenderKt$write$1.label;
        if (i10 == 0) {
        }
    }
}
