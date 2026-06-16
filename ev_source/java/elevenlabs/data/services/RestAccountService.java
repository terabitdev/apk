package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import io.elevenlabs.data.api.AccountAPI;
import io.elevenlabs.data.extensions.ApiResultExtensionKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.response.GetAccountResponse;
import io.elevenlabs.domain.model.AccountPage;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.AccountService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import tn.p;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\u000b"}, d2 = {"Lio/elevenlabs/data/services/RestAccountService;", "Lio/elevenlabs/domain/services/AccountService;", "Lio/elevenlabs/data/api/AccountAPI;", "accountAPI", "<init>", "(Lio/elevenlabs/data/api/AccountAPI;)V", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/model/AccountPage;", "getAccount", "(Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/api/AccountAPI;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class RestAccountService implements AccountService {
    private final AccountAPI accountAPI;

    public RestAccountService(AccountAPI accountAPI) {
        accountAPI.getClass();
        this.accountAPI = accountAPI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountPage getAccount$lambda$0(GetAccountResponse getAccountResponse) {
        AccountPage.Section creditsUnlimited;
        AccountPage.Section termsAndConditions;
        getAccountResponse.getClass();
        List<GetAccountResponse.Section> sections = getAccountResponse.getSections();
        ArrayList arrayList = new ArrayList(p.a0(sections, 10));
        for (GetAccountResponse.Section section : sections) {
            if (section instanceof GetAccountResponse.Section.Credits) {
                GetAccountResponse.Section.Credits credits = (GetAccountResponse.Section.Credits) section;
                creditsUnlimited = new AccountPage.Section.Credits(credits.getCurrentPlan(), credits.isPaidPlan(), credits.getCanUpgrade(), credits.getText(), credits.getTimeText(), credits.getDescription(), credits.getCounterNumber());
            } else {
                if (section instanceof GetAccountResponse.Section.HelpfulResourcesV2) {
                    GetAccountResponse.Section.HelpfulResourcesV2 helpfulResourcesV2 = (GetAccountResponse.Section.HelpfulResourcesV2) section;
                    String title = helpfulResourcesV2.getTitle();
                    List<GetAccountResponse.Section.HelpfulResourcesV2.Item> items = helpfulResourcesV2.getItems();
                    ArrayList arrayList2 = new ArrayList(p.a0(items, 10));
                    for (GetAccountResponse.Section.HelpfulResourcesV2.Item item : items) {
                        arrayList2.add(new AccountPage.Section.HelpfulResourcesV2.Item(item.getTitle(), item.getUrl(), item.getIcon()));
                    }
                    termsAndConditions = new AccountPage.Section.HelpfulResourcesV2(title, arrayList2);
                } else if (section instanceof GetAccountResponse.Section.TermsAndConditions) {
                    GetAccountResponse.Section.TermsAndConditions termsAndConditions2 = (GetAccountResponse.Section.TermsAndConditions) section;
                    String title2 = termsAndConditions2.getTitle();
                    List<GetAccountResponse.Section.TermsAndConditions.Item> items2 = termsAndConditions2.getItems();
                    ArrayList arrayList3 = new ArrayList(p.a0(items2, 10));
                    for (GetAccountResponse.Section.TermsAndConditions.Item item2 : items2) {
                        arrayList3.add(new AccountPage.Section.TermsAndConditions.Item(item2.getTitle(), item2.getUrl(), item2.getIcon()));
                    }
                    termsAndConditions = new AccountPage.Section.TermsAndConditions(title2, arrayList3);
                } else if (section instanceof GetAccountResponse.Section.LocalSettings) {
                    creditsUnlimited = AccountPage.Section.LocalSettings.INSTANCE;
                } else if (section instanceof GetAccountResponse.Section.CreditsUnlimited) {
                    GetAccountResponse.Section.CreditsUnlimited creditsUnlimited2 = (GetAccountResponse.Section.CreditsUnlimited) section;
                    creditsUnlimited = new AccountPage.Section.CreditsUnlimited(creditsUnlimited2.getCurrentPlan(), creditsUnlimited2.getTimeText(), creditsUnlimited2.getDescription());
                } else {
                    c6.p();
                    return null;
                }
                creditsUnlimited = termsAndConditions;
            }
            arrayList.add(creditsUnlimited);
        }
        return new AccountPage(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.AccountService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAccount(wn.c<? super AsyncCallResult<AccountPage>> cVar) {
        RestAccountService$getAccount$1 restAccountService$getAccount$1;
        int i10;
        if (cVar instanceof RestAccountService$getAccount$1) {
            restAccountService$getAccount$1 = (RestAccountService$getAccount$1) cVar;
            int i11 = restAccountService$getAccount$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                restAccountService$getAccount$1.label = i11 - Integer.MIN_VALUE;
                Object obj = restAccountService$getAccount$1.result;
                i10 = restAccountService$getAccount$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    AccountAPI accountAPI = this.accountAPI;
                    restAccountService$getAccount$1.label = 1;
                    obj = accountAPI.getAccount(restAccountService$getAccount$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), new h(1));
            }
        }
        restAccountService$getAccount$1 = new RestAccountService$getAccount$1(this, cVar);
        Object obj2 = restAccountService$getAccount$1.result;
        i10 = restAccountService$getAccount$1.label;
        if (i10 == 0) {
        }
        return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj2), new h(1));
    }
}
