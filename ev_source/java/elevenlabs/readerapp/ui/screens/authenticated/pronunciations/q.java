package io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations;

import io.elevenlabs.domain.model.Pronunciation;
import io.elevenlabs.domain.model.PronunciationPreviewState;
import io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationScreenMode;
import io.elevenlabs.ui.components.ActionConfig;
import io.elevenlabs.ui.components.ActionSpecBuilder;
import sn.z;
import u2.z0;
import y4.w;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16613a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16614b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16615c;

    public /* synthetic */ q(Object obj, Object obj2, int i10) {
        this.f16613a = i10;
        this.f16615c = obj;
        this.f16614b = obj2;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        PronunciationsListState invokeSuspend$lambda$0$0;
        z PronunciationScreenUI$lambda$9$0$0$0$0;
        PronunciationState initEdit$lambda$0;
        PronunciationState initAdd$lambda$0;
        z PronunciationItem$lambda$5$1$0;
        switch (this.f16613a) {
            case 0:
                return PronunciationsListViewModel$onEditPronunciation$1.d((String) this.f16615c, (Pronunciation) this.f16614b, (PronunciationsListState) obj);
            case 1:
                invokeSuspend$lambda$0$0 = PronunciationsListViewModel$onPlayPreview$1$1.invokeSuspend$lambda$0$0((PronunciationPreviewState) this.f16615c, (Pronunciation) this.f16614b, (PronunciationsListState) obj);
                return invokeSuspend$lambda$0$0;
            case 2:
                PronunciationScreenUI$lambda$9$0$0$0$0 = PronunciationScreenKt.PronunciationScreenUI$lambda$9$0$0$0$0((ho.l) this.f16615c, (z0) this.f16614b, (w) obj);
                return PronunciationScreenUI$lambda$9$0$0$0$0;
            case 3:
                initEdit$lambda$0 = PronunciationViewModel.initEdit$lambda$0((PronunciationScreenMode.Edit) this.f16615c, (PronunciationViewModel) this.f16614b, (PronunciationState) obj);
                return initEdit$lambda$0;
            case 4:
                initAdd$lambda$0 = PronunciationViewModel.initAdd$lambda$0((PronunciationScreenMode.Add) this.f16615c, (PronunciationViewModel) this.f16614b, (PronunciationState) obj);
                return initAdd$lambda$0;
            default:
                PronunciationItem$lambda$5$1$0 = PronunciationsListScreenKt.PronunciationItem$lambda$5$1$0((ActionConfig) this.f16615c, (ActionConfig) this.f16614b, (ActionSpecBuilder.PlacementScope) obj);
                return PronunciationItem$lambda$5$1$0;
        }
    }
}
