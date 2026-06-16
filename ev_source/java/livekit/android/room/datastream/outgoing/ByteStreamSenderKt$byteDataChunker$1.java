package io.livekit.android.room.datastream.outgoing;

import ae.l;
import com.google.firebase.messaging.Constants;
import ho.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import livekit.LivekitInternal$NodeStats;
import no.e;
import no.f;
import tn.y;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "chunkSize", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ByteStreamSenderKt$byteDataChunker$1 extends n implements p {
    public static final ByteStreamSenderKt$byteDataChunker$1 INSTANCE = new ByteStreamSenderKt$byteDataChunker$1();

    public ByteStreamSenderKt$byteDataChunker$1() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [no.g, no.e] */
    public final List<byte[]> invoke(byte[] bArr, int i10) {
        bArr.getClass();
        e b02 = l.b0(i10, new e(0, bArr.length - 1, 1));
        ArrayList arrayList = new ArrayList(tn.p.a0(b02, 10));
        Iterator it = b02.iterator();
        while (((f) it).f24561c) {
            int nextInt = ((y) it).nextInt();
            arrayList.add(Arrays.copyOfRange(bArr, nextInt, Math.min(nextInt + i10, bArr.length)));
        }
        return arrayList;
    }

    @Override // ho.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((byte[]) obj, ((Number) obj2).intValue());
    }
}
