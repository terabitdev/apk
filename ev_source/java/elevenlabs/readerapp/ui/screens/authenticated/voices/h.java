package io.elevenlabs.readerapp.ui.screens.authenticated.voices;

import io.elevenlabs.domain.model.ReadMeta;
import r1.l2;
import sn.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17127b;

    public /* synthetic */ h(Object obj, int i10) {
        this.f17126a = i10;
        this.f17127b = obj;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z VoiceDataUI$lambda$1$1$3;
        z VoiceDetailsScreenUI$lambda$2$0$1;
        z filterSelect$lambda$0$5$4$0$0;
        switch (this.f17126a) {
            case 0:
                VoiceDataUI$lambda$1$1$3 = VoiceDetailsScreenKt.VoiceDataUI$lambda$1$1$3((ReadMeta) this.f17127b, (r1.s) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return VoiceDataUI$lambda$1$1$3;
            case 1:
                VoiceDetailsScreenUI$lambda$2$0$1 = VoiceDetailsScreenKt.VoiceDetailsScreenUI$lambda$2$0$1((ho.a) this.f17127b, (l2) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return VoiceDetailsScreenUI$lambda$2$0$1;
            default:
                filterSelect$lambda$0$5$4$0$0 = VoiceFiltersDialogKt.filterSelect$lambda$0$5$4$0$0((z0) this.f17127b, (t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return filterSelect$lambda$0$5$4$0$0;
        }
    }
}
