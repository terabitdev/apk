package io.elevenlabs.readerapp.ui.screens.authenticated.voices;

import io.elevenlabs.domain.model.Filter;
import io.elevenlabs.domain.model.ReadMeta;
import sn.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f17106b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17107c;

    public /* synthetic */ c(ho.l lVar, Object obj, int i10) {
        this.f17105a = i10;
        this.f17106b = lVar;
        this.f17107c = obj;
    }

    @Override // ho.a
    public final Object invoke() {
        z VoiceActionButtons$lambda$1$6$0;
        z VoiceDataUI$lambda$1$1$2$0;
        z filterChips$lambda$0$0$0$0$0;
        switch (this.f17105a) {
            case 0:
                VoiceActionButtons$lambda$1$6$0 = VoiceDetailsScreenKt.VoiceActionButtons$lambda$1$6$0(this.f17106b, (z0) this.f17107c);
                return VoiceActionButtons$lambda$1$6$0;
            case 1:
                VoiceDataUI$lambda$1$1$2$0 = VoiceDetailsScreenKt.VoiceDataUI$lambda$1$1$2$0(this.f17106b, (ReadMeta) this.f17107c);
                return VoiceDataUI$lambda$1$1$2$0;
            default:
                filterChips$lambda$0$0$0$0$0 = VoiceFiltersDialogKt.filterChips$lambda$0$0$0$0$0(this.f17106b, (Filter) this.f17107c);
                return filterChips$lambda$0$0$0$0$0;
        }
    }
}
