package io.elevenlabs.readerapp.ui.screens.authenticated.agent;

import ho.l;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentContract;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15082b;

    public /* synthetic */ h(Object obj, int i10) {
        this.f15081a = i10;
        this.f15082b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        AskAgentContract.State handleSendMessage$lambda$0;
        z AskAgentScreen$lambda$3$0;
        switch (this.f15081a) {
            case 0:
                return AskAgentViewModel$startAgentSession$2.d((String) this.f15082b, (AskAgentContract.State) obj);
            case 1:
                handleSendMessage$lambda$0 = AskAgentViewModel.handleSendMessage$lambda$0((String) this.f15082b, (AskAgentContract.State) obj);
                return handleSendMessage$lambda$0;
            case 2:
                return AskAgentViewModel$sessionListener$1.a((String) this.f15082b, (AskAgentContract.State) obj);
            default:
                AskAgentScreen$lambda$3$0 = AskAgentScreenKt.AskAgentScreen$lambda$3$0((AskAgentViewModel) this.f15082b, (String) obj);
                return AskAgentScreen$lambda$3$0;
        }
    }
}
