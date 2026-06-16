package io.elevenlabs.readerapp.ui.screens.authenticated.agent;

import ho.l;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentViewModel;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15077a;

    public /* synthetic */ f(int i10) {
        this.f15077a = i10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        AskAgentContract.State emit$lambda$0;
        AskAgentContract.State handleDismissCustomerCenter$lambda$0;
        AskAgentContract.State startAgentSession$lambda$0;
        z lambda_87571999$lambda$0$1$0;
        z lambda_319085793$lambda$0$1$0;
        switch (this.f15077a) {
            case 0:
                emit$lambda$0 = AskAgentViewModel.AnonymousClass3.AnonymousClass1.emit$lambda$0((AskAgentContract.State) obj);
                return emit$lambda$0;
            case 1:
                return AskAgentViewModel$handleEndChat$1.d((AskAgentContract.State) obj);
            case 2:
                handleDismissCustomerCenter$lambda$0 = AskAgentViewModel.handleDismissCustomerCenter$lambda$0((AskAgentContract.State) obj);
                return handleDismissCustomerCenter$lambda$0;
            case 3:
                startAgentSession$lambda$0 = AskAgentViewModel.startAgentSession$lambda$0((AskAgentContract.State) obj);
                return startAgentSession$lambda$0;
            case 4:
                lambda_87571999$lambda$0$1$0 = ComposableSingletons$AskAgentScreenKt.lambda_87571999$lambda$0$1$0((String) obj);
                return lambda_87571999$lambda$0$1$0;
            default:
                lambda_319085793$lambda$0$1$0 = ComposableSingletons$AskAgentScreenKt.lambda_319085793$lambda$0$1$0((String) obj);
                return lambda_319085793$lambda$0$1$0;
        }
    }
}
