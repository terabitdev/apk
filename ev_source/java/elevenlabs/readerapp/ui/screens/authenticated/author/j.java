package io.elevenlabs.readerapp.ui.screens.authenticated.author;

import ho.q;
import io.elevenlabs.domain.model.AuthorProfile;
import io.elevenlabs.domain.model.AuthorProfileSection;
import io.elevenlabs.domain.model.ListeningProgress;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.HomeRecentReadsCarouselKt;
import r1.s;
import sn.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15217a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.a f15218b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f15219c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15221e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15222f;

    public /* synthetic */ j(AuthorProfile authorProfile, AuthorProfileSection.Actions actions, boolean z6, ho.a aVar, ho.l lVar) {
        this.f15220d = authorProfile;
        this.f15221e = actions;
        this.f15219c = z6;
        this.f15218b = aVar;
        this.f15222f = lVar;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z AuthorProfileContent$lambda$3$0$0$0$1;
        z RecentReadItemV4$lambda$4;
        switch (this.f15217a) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                AuthorProfileContent$lambda$3$0$0$0$1 = AuthorProfileScreenKt.AuthorProfileContent$lambda$3$0$0$0$1((AuthorProfile) this.f15220d, (AuthorProfileSection.Actions) this.f15221e, this.f15219c, this.f15218b, (ho.l) this.f15222f, (t1.b) obj, (u2.m) obj2, intValue);
                return AuthorProfileContent$lambda$3$0$0$0$1;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                RecentReadItemV4$lambda$4 = HomeRecentReadsCarouselKt.RecentReadItemV4$lambda$4((ReadMeta) this.f15220d, (ListeningProgress) this.f15221e, (z0) this.f15222f, this.f15218b, this.f15219c, (s) obj, (u2.m) obj2, intValue2);
                return RecentReadItemV4$lambda$4;
        }
    }

    public /* synthetic */ j(ReadMeta readMeta, ListeningProgress listeningProgress, z0 z0Var, ho.a aVar, boolean z6) {
        this.f15220d = readMeta;
        this.f15221e = listeningProgress;
        this.f15222f = z0Var;
        this.f15218b = aVar;
        this.f15219c = z6;
    }
}
