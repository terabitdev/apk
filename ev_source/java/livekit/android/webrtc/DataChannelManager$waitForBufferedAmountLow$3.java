package io.livekit.android.webrtc;

import com.google.protobuf.c6;
import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.livekit.android.webrtc.DataChannelManager$waitForBufferedAmountLow$3", f = "DataChannelManager.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class DataChannelManager$waitForBufferedAmountLow$3 extends i implements p {
    final /* synthetic */ long $amount;
    /* synthetic */ long J$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataChannelManager$waitForBufferedAmountLow$3(long j4, wn.c<? super DataChannelManager$waitForBufferedAmountLow$3> cVar) {
        super(2, cVar);
        this.$amount = j4;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        DataChannelManager$waitForBufferedAmountLow$3 dataChannelManager$waitForBufferedAmountLow$3 = new DataChannelManager$waitForBufferedAmountLow$3(this.$amount, cVar);
        dataChannelManager$waitForBufferedAmountLow$3.J$0 = ((Number) obj).longValue();
        return dataChannelManager$waitForBufferedAmountLow$3;
    }

    public final Object invoke(long j4, wn.c<? super Boolean> cVar) {
        return ((DataChannelManager$waitForBufferedAmountLow$3) create(Long.valueOf(j4), cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        boolean z6;
        if (this.label == 0) {
            sn.a.g(obj);
            if (this.J$0 > this.$amount) {
                z6 = true;
            } else {
                z6 = false;
            }
            return Boolean.valueOf(z6);
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // ho.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).longValue(), (wn.c<? super Boolean>) obj2);
    }
}
