package io.elevenlabs.readerapp.ui.components;

import io.elevenlabs.ui.components.AnimatedDigitCounterKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements ho.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14512a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f14513b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14514c;

    public /* synthetic */ a1(long j4, s4.y0 y0Var) {
        this.f14513b = j4;
        this.f14514c = y0Var;
    }

    @Override // ho.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        sn.z VoiceCollectionCell_FNF3uiM$lambda$4$0$2;
        switch (this.f14512a) {
            case 0:
                int intValue = ((Integer) obj4).intValue();
                VoiceCollectionCell_FNF3uiM$lambda$4$0$2 = VoiceCollectionCellKt.VoiceCollectionCell_FNF3uiM$lambda$4$0$2((i3.t) this.f14514c, this.f14513b, (r1.s) obj, (wk.b) obj2, (u2.m) obj3, intValue);
                return VoiceCollectionCell_FNF3uiM$lambda$4$0$2;
            default:
                int intValue2 = ((Integer) obj4).intValue();
                return AnimatedDigitCounterKt.d(this.f14513b, (s4.y0) this.f14514c, (i1.o) obj, ((Character) obj2).charValue(), (u2.m) obj3, intValue2);
        }
    }

    public /* synthetic */ a1(i3.t tVar, long j4) {
        this.f14514c = tVar;
        this.f14513b = j4;
    }
}
