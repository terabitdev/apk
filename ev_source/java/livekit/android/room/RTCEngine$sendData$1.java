package io.livekit.android.room;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.m;
import xn.a;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.RTCEngine", f = "RTCEngine.kt", l = {691}, m = "sendData-gIAlu-s$livekit_android_sdk_release")
@Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class RTCEngine$sendData$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RTCEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTCEngine$sendData$1(RTCEngine rTCEngine, wn.c<? super RTCEngine$sendData$1> cVar) {
        super(cVar);
        this.this$0 = rTCEngine;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m2529sendDatagIAlus$livekit_android_sdk_release = this.this$0.m2529sendDatagIAlus$livekit_android_sdk_release(null, this);
        if (m2529sendDatagIAlus$livekit_android_sdk_release == a.f37986a) {
            return m2529sendDatagIAlus$livekit_android_sdk_release;
        }
        return new m(m2529sendDatagIAlus$livekit_android_sdk_release);
    }
}
