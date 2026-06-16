package io.elevenlabs.readerapp.ui.screens.authenticated.account.components;

import ho.p;
import io.elevenlabs.domain.model.AccountPage;
import io.elevenlabs.readerapp.ui.previews.AccountFactoryKt;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.l;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$AccountDynamicSectionKt {
    public static final ComposableSingletons$AccountDynamicSectionKt INSTANCE = new ComposableSingletons$AccountDynamicSectionKt();
    private static p lambda$298092695 = new c3.j(new io.elevenlabs.readerapp.ui.components.explore.d(16), false, 298092695);

    /* renamed from: lambda$-1527262698 */
    private static p f210lambda$1527262698 = new c3.j(new io.elevenlabs.readerapp.ui.components.explore.d(17), false, -1527262698);
    private static p lambda$1460970961 = new c3.j(new io.elevenlabs.readerapp.ui.components.explore.d(18), false, 1460970961);

    public static final z lambda_1460970961$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            AccountPage.Section.HelpfulResourcesV2 stubHelpfulResourcesNoIcons = AccountFactoryKt.stubHelpfulResourcesNoIcons();
            AccountDynamicSectionKt.AccountHelpfulResourcesSection(stubHelpfulResourcesNoIcons.getTitle(), stubHelpfulResourcesNoIcons.getItems(), qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_298092695$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            AccountPage.Section.HelpfulResourcesV2 stubHelpfulResources = AccountFactoryKt.stubHelpfulResources();
            AccountDynamicSectionKt.AccountHelpfulResourcesSection(stubHelpfulResources.getTitle(), stubHelpfulResources.getItems(), qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1527262698$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            AccountPage.Section.TermsAndConditions stubTermsAndConditions = AccountFactoryKt.stubTermsAndConditions();
            String title = stubTermsAndConditions.getTitle();
            List<AccountPage.Section.TermsAndConditions.Item> items = stubTermsAndConditions.getItems();
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.components.explore.b(14);
                qVar.h0(L);
            }
            AccountDynamicSectionKt.AccountTermsAndConditionsSection(title, items, (ho.a) L, qVar, 384);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1527262698$app_productionRelease */
    public final p m1238getLambda$1527262698$app_productionRelease() {
        return f210lambda$1527262698;
    }

    public final p getLambda$1460970961$app_productionRelease() {
        return lambda$1460970961;
    }

    public final p getLambda$298092695$app_productionRelease() {
        return lambda$298092695;
    }
}
