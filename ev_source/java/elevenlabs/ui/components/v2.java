package io.elevenlabs.ui.components;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v2 implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u2.z0 f17685b;

    public /* synthetic */ v2(u2.z0 z0Var, int i10) {
        this.f17684a = i10;
        this.f17685b = z0Var;
    }

    @Override // ho.a
    public final Object invoke() {
        sn.z SwipeToActionBox$lambda$21$1$0;
        sn.z SwipeToActionBox$lambda$21$2$0$0;
        sn.z VoiceCircle$lambda$6$3$0;
        switch (this.f17684a) {
            case 0:
                return SwipeToActionBoxKt$SwipeToActionBox$2$1.h(this.f17685b);
            case 1:
                SwipeToActionBox$lambda$21$1$0 = SwipeToActionBoxKt.SwipeToActionBox$lambda$21$1$0(this.f17685b);
                return SwipeToActionBox$lambda$21$1$0;
            case 2:
                SwipeToActionBox$lambda$21$2$0$0 = SwipeToActionBoxKt.SwipeToActionBox$lambda$21$2$0$0(this.f17685b);
                return SwipeToActionBox$lambda$21$2$0$0;
            default:
                VoiceCircle$lambda$6$3$0 = VoiceCircleKt.VoiceCircle$lambda$6$3$0(this.f17685b);
                return VoiceCircle$lambda$6$3$0;
        }
    }
}
