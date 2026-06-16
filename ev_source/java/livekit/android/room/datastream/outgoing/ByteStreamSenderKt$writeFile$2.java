package io.livekit.android.room.datastream.outgoing;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.m;
import xn.a;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.datastream.outgoing.ByteStreamSenderKt", f = "ByteStreamSender.kt", l = {76}, m = "writeFile")
@Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ByteStreamSenderKt$writeFile$2 extends c {
    int label;
    /* synthetic */ Object result;

    public ByteStreamSenderKt$writeFile$2(wn.c<? super ByteStreamSenderKt$writeFile$2> cVar) {
        super(cVar);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object writeFile = ByteStreamSenderKt.writeFile((ByteStreamSender) null, (String) null, this);
        if (writeFile == a.f37986a) {
            return writeFile;
        }
        return new m(writeFile);
    }
}
