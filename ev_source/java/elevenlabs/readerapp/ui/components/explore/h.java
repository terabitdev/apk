package io.elevenlabs.readerapp.ui.components.explore;

import io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.ExploreVoiceCollectionKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.VoicePromptStepKt;
import java.util.List;
import sn.z;
import t1.t;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f14594b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.l f14595c;

    public /* synthetic */ h(List list, int i10, ho.l lVar) {
        this.f14593a = i10;
        this.f14594b = list;
        this.f14595c = lVar;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z ExploreCardCarouselCollection$lambda$1$0$0;
        z ExploreVoiceCollection$lambda$1$0$0;
        z VoicePromptStep$lambda$0$5$0;
        switch (this.f14593a) {
            case 0:
                ExploreCardCarouselCollection$lambda$1$0$0 = ExploreCardCarouselCollectionKt.ExploreCardCarouselCollection$lambda$1$0$0(this.f14594b, this.f14595c, (t) obj);
                return ExploreCardCarouselCollection$lambda$1$0$0;
            case 1:
                ExploreVoiceCollection$lambda$1$0$0 = ExploreVoiceCollectionKt.ExploreVoiceCollection$lambda$1$0$0(this.f14594b, this.f14595c, (t) obj);
                return ExploreVoiceCollection$lambda$1$0$0;
            default:
                VoicePromptStep$lambda$0$5$0 = VoicePromptStepKt.VoicePromptStep$lambda$0$5$0(this.f14594b, this.f14595c, (t) obj);
                return VoicePromptStep$lambda$0$5$0;
        }
    }
}
