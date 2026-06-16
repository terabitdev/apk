package io.livekit.android.room.datastream.outgoing;

import java.io.InputStream;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.m;
import xn.a;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.datastream.outgoing.ByteStreamSenderKt", f = "ByteStreamSender.kt", l = {84}, m = "write")
@Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ByteStreamSenderKt$write$1 extends c {
    int label;
    /* synthetic */ Object result;

    public ByteStreamSenderKt$write$1(wn.c<? super ByteStreamSenderKt$write$1> cVar) {
        super(cVar);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object write = ByteStreamSenderKt.write((ByteStreamSender) null, (InputStream) null, this);
        if (write == a.f37986a) {
            return write;
        }
        return new m(write);
    }
}
