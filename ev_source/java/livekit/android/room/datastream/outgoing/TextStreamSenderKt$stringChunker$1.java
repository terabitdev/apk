package io.livekit.android.room.datastream.outgoing;

import android.gov.nist.javax.sip.header.ParameterNames;
import ho.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import livekit.LivekitInternal$NodeStats;
import wq.b;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "", ParameterNames.TEXT, "", "chunkSize", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class TextStreamSenderKt$stringChunker$1 extends n implements p {
    public static final TextStreamSenderKt$stringChunker$1 INSTANCE = new TextStreamSenderKt$stringChunker$1();

    public TextStreamSenderKt$stringChunker$1() {
        super(2);
    }

    public final List<byte[]> invoke(String str, int i10) {
        int i11;
        str.getClass();
        byte[] bytes = str.getBytes(b.f37231a);
        bytes.getClass();
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < bytes.length) {
            byte b10 = bytes[i12];
            if ((b10 & 248) == 240) {
                i11 = 4;
            } else if ((b10 & 240) == 224) {
                i11 = 3;
            } else if ((b10 & 224) == 192) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            if ((i14 - i13) + i11 > i10) {
                byte[] copyOfRange = Arrays.copyOfRange(bytes, i13, i14);
                copyOfRange.getClass();
                arrayList.add(copyOfRange);
                i13 = i14;
            }
            i14 = i12 + i11;
            i12 = i14;
        }
        if (i13 != i14) {
            byte[] copyOfRange2 = Arrays.copyOfRange(bytes, i13, i14);
            copyOfRange2.getClass();
            arrayList.add(copyOfRange2);
        }
        return arrayList;
    }

    @Override // ho.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((String) obj, ((Number) obj2).intValue());
    }
}
