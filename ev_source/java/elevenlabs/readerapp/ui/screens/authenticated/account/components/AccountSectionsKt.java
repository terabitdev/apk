package io.elevenlabs.readerapp.ui.screens.authenticated.account.components;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.domain.model.AccountPage;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001ac\u0010\n\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "Lio/elevenlabs/domain/model/AccountPage$Section;", "sections", "Lkotlin/Function0;", "Lsn/z;", "onNavigateToReferAFriend", "onNavigateToExplorePreferences", "onNavigateLicenses", "onNavigateToCustomerCenter", "onNavigateToHoursHistory", "AccountSections", "(Ljava/util/List;Lho/a;Lho/a;Lho/a;Lho/a;Lho/a;Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AccountSectionsKt {
    public static final void AccountSections(List<? extends AccountPage.Section> list, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, ho.a aVar5, m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        list.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        aVar5.getClass();
        q qVar = (q) mVar;
        qVar.Z(402933838);
        if ((i10 & 6) == 0) {
            if (qVar.h(list)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i11 = i17 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i11 |= i16;
        }
        ho.a aVar6 = aVar2;
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar6)) {
                i15 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i15 = 128;
            }
            i11 |= i15;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(aVar3)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i14;
        }
        ho.a aVar7 = aVar4;
        if ((i10 & 24576) == 0) {
            if (qVar.h(aVar7)) {
                i13 = 16384;
            } else {
                i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i13;
        }
        ho.a aVar8 = aVar5;
        if ((196608 & i10) == 0) {
            if (qVar.h(aVar8)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i11 |= i12;
        }
        if ((74899 & i11) != 74898) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            for (AccountPage.Section section : list) {
                if (!(section instanceof AccountPage.Section.Credits) && !(section instanceof AccountPage.Section.HelpfulResourcesV2)) {
                    if (section instanceof AccountPage.Section.TermsAndConditions) {
                        qVar.X(705185105);
                        AccountPage.Section.TermsAndConditions termsAndConditions = (AccountPage.Section.TermsAndConditions) section;
                        AccountDynamicSectionKt.AccountTermsAndConditionsSection(termsAndConditions.getTitle(), termsAndConditions.getItems(), aVar3, qVar, (i11 >> 3) & 896);
                        qVar.p(false);
                    } else if (section instanceof AccountPage.Section.LocalSettings) {
                        qVar.X(386142182);
                        AccountSectionDividerKt.AccountSectionDivider(null, qVar, 0, 1);
                        int i18 = i11 >> 6;
                        AccountPreferencesKt.AccountPreferences(aVar, aVar6, aVar7, aVar8, qVar, ((i11 >> 3) & 126) | (i18 & 896) | (i18 & 7168));
                        qVar.p(false);
                    } else if (section instanceof AccountPage.Section.CreditsUnlimited) {
                        qVar.X(705207584);
                        qVar.p(false);
                    } else {
                        throw com.google.android.gms.internal.play_billing.b.h(705180407, qVar, false);
                    }
                } else {
                    qVar.X(705182912);
                    qVar.p(false);
                }
                aVar6 = aVar2;
                aVar7 = aVar4;
                aVar8 = aVar5;
            }
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c3.e(list, aVar, aVar2, aVar3, aVar4, aVar5, i10, 6);
        }
    }

    public static final z AccountSections$lambda$1(List list, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, ho.a aVar5, int i10, m mVar, int i11) {
        AccountSections(list, aVar, aVar2, aVar3, aVar4, aVar5, mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
