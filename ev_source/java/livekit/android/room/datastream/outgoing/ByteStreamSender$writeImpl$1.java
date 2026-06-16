package io.livekit.android.room.datastream.outgoing;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.m;
import xn.a;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.datastream.outgoing.ByteStreamSender", f = "ByteStreamSender.kt", l = {41}, m = "writeImpl-gIAlu-s$livekit_android_sdk_release")
@Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ByteStreamSender$writeImpl$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ByteStreamSender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteStreamSender$writeImpl$1(ByteStreamSender byteStreamSender, wn.c<? super ByteStreamSender$writeImpl$1> cVar) {
        super(cVar);
        this.this$0 = byteStreamSender;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m2558writeImplgIAlus$livekit_android_sdk_release = this.this$0.m2558writeImplgIAlus$livekit_android_sdk_release((byte[]) null, (wn.c<? super m>) this);
        if (m2558writeImplgIAlus$livekit_android_sdk_release == a.f37986a) {
            return m2558writeImplgIAlus$livekit_android_sdk_release;
        }
        return new m(m2558writeImplgIAlus$livekit_android_sdk_release);
    }
}
