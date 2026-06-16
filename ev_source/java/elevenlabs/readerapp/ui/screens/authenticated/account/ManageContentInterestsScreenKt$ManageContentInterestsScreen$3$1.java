package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import io.elevenlabs.domain.model.InterestsQuestion;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* synthetic */ class ManageContentInterestsScreenKt$ManageContentInterestsScreen$3$1 extends kotlin.jvm.internal.a implements ho.p {
    public ManageContentInterestsScreenKt$ManageContentInterestsScreen$3$1(Object obj) {
        super(2, 8, ManageContentInterestsViewModel.class, obj, "toggleInterestSelection", "toggleInterestSelection(Lio/elevenlabs/domain/model/InterestsQuestion;Ljava/lang/String;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;");
    }

    public final void invoke(InterestsQuestion interestsQuestion, String str) {
        interestsQuestion.getClass();
        str.getClass();
        ((ManageContentInterestsViewModel) this.receiver).toggleInterestSelection(interestsQuestion, str);
    }

    @Override // ho.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterestsQuestion) obj, (String) obj2);
        return z.f31622a;
    }
}
