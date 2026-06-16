package io.elevenlabs.readerapp.ui.screens.authenticated.author.components;

import c3.j;
import ho.p;
import ig.f;
import io.elevenlabs.domain.model.AuthorProfileHeaderSection;
import io.elevenlabs.domain.model.AuthorProfileResourceTag;
import io.elevenlabs.domain.model.AuthorProfileSection;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.a;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$AuthorProfileHeaderKt {
    public static final ComposableSingletons$AuthorProfileHeaderKt INSTANCE = new ComposableSingletons$AuthorProfileHeaderKt();

    /* renamed from: lambda$-1506057371 */
    private static p f282lambda$1506057371 = new j(new a(11), false, -1506057371);

    /* renamed from: lambda$-121607339 */
    private static p f281lambda$121607339 = new j(new a(12), false, -121607339);

    public static final z lambda__121607339$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            AuthorProfileHeaderKt.AuthorProfileHeader(new AuthorProfileSection.Header(new AuthorProfileHeaderSection("Charles Dickens", null, null, null, null, 15, 0, 42)), null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1506057371$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            AuthorProfileHeaderKt.AuthorProfileHeader(new AuthorProfileSection.Header(new AuthorProfileHeaderSection("Jane Austen", "Jane Austen was an English novelist known primarily for her six major novels, which interpret, critique and comment upon the British landed gentry at the end of the 18th century. Austen's plots often explore the dependence of women on marriage in the pursuit of favourable social standing and economic security. Her works critique the novels of sensibility of the second half of the 18th century and are part of the transition to 19th-century literary realism.", "https://example.com/jane-austen.jpg", "A Lady", f.I(new AuthorProfileResourceTag("https://example.com/twitter.png", "Twitter", "https://twitter.com/author"), new AuthorProfileResourceTag("https://example.com/website.png", "Website", "https://author-website.com")), 6, 2, 1250)), null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-121607339$app_productionRelease */
    public final p m1318getLambda$121607339$app_productionRelease() {
        return f281lambda$121607339;
    }

    /* renamed from: getLambda$-1506057371$app_productionRelease */
    public final p m1319getLambda$1506057371$app_productionRelease() {
        return f282lambda$1506057371;
    }
}
