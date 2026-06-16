package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.VoicePickerSectionsListKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import java.util.List;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p1 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16264a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f16265b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16266c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16268e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16269f;

    public /* synthetic */ p1(boolean z6, j1.l0 l0Var, u2.z0 z0Var, j1.r1 r1Var, j1.r1 r1Var2) {
        this.f16264a = 2;
        this.f16265b = z6;
        this.f16266c = l0Var;
        this.f16267d = z0Var;
        this.f16268e = r1Var;
        this.f16269f = r1Var2;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        PlayerState readId$lambda$0;
        sn.z VoicePickerSectionsList_Q1bl1hc$lambda$0$0;
        float f10;
        switch (this.f16264a) {
            case 0:
                readId$lambda$0 = PlayerViewModel.setReadId$lambda$0((String) this.f16266c, (String) this.f16267d, (Integer) this.f16268e, this.f16265b, (PlayerViewModel) this.f16269f, (PlayerState) obj);
                return readId$lambda$0;
            case 1:
                VoicePickerSectionsList_Q1bl1hc$lambda$0$0 = VoicePickerSectionsListKt.VoicePickerSectionsList_Q1bl1hc$lambda$0$0((List) this.f16266c, (VoicePickerSharedContract.State) this.f16267d, (ho.l) this.f16268e, this.f16265b, (ho.l) this.f16269f, (t1.t) obj);
                return VoicePickerSectionsList_Q1bl1hc$lambda$0$0;
            case 2:
                u2.i1 i1Var = ((j1.l0) this.f16266c).f18312c;
                u2.z0 z0Var = (u2.z0) this.f16267d;
                s2 s2Var = (s2) this.f16268e;
                s2 s2Var2 = (s2) this.f16269f;
                p3.i0 i0Var = (p3.i0) obj;
                boolean z6 = this.f16265b;
                float f11 = 0.8f;
                float f12 = 1.0f;
                if (!z6) {
                    f10 = ((Number) s2Var.getValue()).floatValue();
                } else if (((Boolean) i1Var.getValue()).booleanValue()) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.8f;
                }
                p3.y0 y0Var = (p3.y0) i0Var;
                y0Var.r(f10);
                if (!z6) {
                    f11 = ((Number) s2Var.getValue()).floatValue();
                } else if (((Boolean) i1Var.getValue()).booleanValue()) {
                    f11 = 1.0f;
                }
                y0Var.s(f11);
                if (!z6) {
                    f12 = ((Number) s2Var2.getValue()).floatValue();
                } else if (!((Boolean) i1Var.getValue()).booleanValue()) {
                    f12 = t2.u.P;
                }
                y0Var.c(f12);
                y0Var.z(((p3.e1) z0Var.getValue()).f26375a);
                return sn.z.f31622a;
            default:
                kotlin.jvm.internal.z zVar = (kotlin.jvm.internal.z) this.f16266c;
                kotlin.jvm.internal.z zVar2 = (kotlin.jvm.internal.z) this.f16267d;
                qa.e eVar = (qa.e) this.f16268e;
                tn.l lVar = (tn.l) this.f16269f;
                na.j jVar = (na.j) obj;
                jVar.getClass();
                zVar.f20568a = true;
                zVar2.f20568a = true;
                eVar.o(jVar, this.f16265b, lVar);
                return sn.z.f31622a;
        }
    }

    public /* synthetic */ p1(int i10, Object obj, Object obj2, Object obj3, Object obj4, boolean z6) {
        this.f16264a = i10;
        this.f16266c = obj;
        this.f16267d = obj2;
        this.f16268e = obj3;
        this.f16265b = z6;
        this.f16269f = obj4;
    }
}
