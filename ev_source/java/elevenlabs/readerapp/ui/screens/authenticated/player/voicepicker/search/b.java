package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search;

import f4.r;
import ho.l;
import ho.p;
import i3.g;
import i3.t;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.VoicePickerSectionsListKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import java.util.List;
import qc.x;
import t1.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements p {
    public final /* synthetic */ int Y;
    public final /* synthetic */ Object Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16485a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f16486b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f16487c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16489e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16490f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ Object f16491x0;

    public /* synthetic */ b(float f10, z zVar, boolean z6, List list, VoicePickerSharedContract.State state, l lVar, l lVar2, int i10) {
        this.f16486b = f10;
        this.Z = zVar;
        this.f16487c = z6;
        this.f16491x0 = list;
        this.f16488d = state;
        this.f16489e = lVar;
        this.f16490f = lVar2;
        this.Y = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z VoicePickerSearchListScreenUI_Q1bl1hc$lambda$5;
        sn.z VoicePickerSectionsList_Q1bl1hc$lambda$1;
        switch (this.f16485a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                VoicePickerSearchListScreenUI_Q1bl1hc$lambda$5 = VoicePickerSearchListScreenKt.VoicePickerSearchListScreenUI_Q1bl1hc$lambda$5(this.f16486b, this.f16487c, (VoicePickerSearchListContract.UiState) this.Z, (l) this.f16489e, (VoicePickerSharedContract.State) this.f16488d, (l) this.f16490f, (l) this.f16491x0, this.Y, (m) obj, intValue);
                return VoicePickerSearchListScreenUI_Q1bl1hc$lambda$5;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                VoicePickerSectionsList_Q1bl1hc$lambda$1 = VoicePickerSectionsListKt.VoicePickerSectionsList_Q1bl1hc$lambda$1(this.f16486b, (z) this.Z, this.f16487c, (List) this.f16491x0, (VoicePickerSharedContract.State) this.f16488d, (l) this.f16489e, (l) this.f16490f, this.Y, (m) obj, intValue2);
                return VoicePickerSectionsList_Q1bl1hc$lambda$1;
            default:
                ((Integer) obj2).getClass();
                qc.m.f((x) this.Z, (t) this.f16489e, (u3.c) this.f16490f, (g) this.f16491x0, (r) this.f16488d, this.f16486b, this.f16487c, (m) obj, u2.r.M(this.Y | 1));
                return sn.z.f31622a;
        }
    }

    public /* synthetic */ b(float f10, boolean z6, VoicePickerSearchListContract.UiState uiState, l lVar, VoicePickerSharedContract.State state, l lVar2, l lVar3, int i10) {
        this.f16486b = f10;
        this.f16487c = z6;
        this.Z = uiState;
        this.f16489e = lVar;
        this.f16488d = state;
        this.f16490f = lVar2;
        this.f16491x0 = lVar3;
        this.Y = i10;
    }

    public /* synthetic */ b(x xVar, t tVar, u3.c cVar, g gVar, r rVar, float f10, boolean z6, int i10) {
        this.Z = xVar;
        this.f16489e = tVar;
        this.f16490f = cVar;
        this.f16491x0 = gVar;
        this.f16488d = rVar;
        this.f16486b = f10;
        this.f16487c = z6;
        this.Y = i10;
    }
}
