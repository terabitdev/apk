package io.elevenlabs.readerapp.paging;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.PageData;
import io.elevenlabs.domain.services.AuthorService;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;
import sn.a;
import ta.j1;
import ta.k1;
import ta.l1;
import ta.m1;
import ta.n1;
import ta.o1;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/readerapp/paging/AuthorSubpagePagingSource;", "Lta/n1;", "", "Lio/elevenlabs/domain/model/AuthorProfileSection;", "Lio/elevenlabs/domain/services/AuthorService;", "authorService", "authorId", "subpageId", "sortKey", "<init>", "(Lio/elevenlabs/domain/services/AuthorService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lta/j1;", "params", "Lta/m1;", "load", "(Lta/j1;Lwn/c;)Ljava/lang/Object;", "Lta/o1;", RemoteConfigConstants.ResponseFieldKey.STATE, "getRefreshKey", "(Lta/o1;)Ljava/lang/String;", "Lio/elevenlabs/domain/services/AuthorService;", "Ljava/lang/String;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AuthorSubpagePagingSource extends n1 {
    public static final int $stable = 8;
    private final String authorId;
    private final AuthorService authorService;
    private final String sortKey;
    private final String subpageId;

    public AuthorSubpagePagingSource(AuthorService authorService, String str, String str2, String str3) {
        authorService.getClass();
        str.getClass();
        str2.getClass();
        this.authorService = authorService;
        this.authorId = str;
        this.subpageId = str2;
        this.sortKey = str3;
    }

    @Override // ta.n1
    public String getRefreshKey(o1 state) {
        state.getClass();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // ta.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object load(j1 j1Var, c<? super m1> cVar) {
        AuthorSubpagePagingSource$load$1 authorSubpagePagingSource$load$1;
        int i10;
        AsyncCallResult asyncCallResult;
        if (cVar instanceof AuthorSubpagePagingSource$load$1) {
            authorSubpagePagingSource$load$1 = (AuthorSubpagePagingSource$load$1) cVar;
            int i11 = authorSubpagePagingSource$load$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                authorSubpagePagingSource$load$1.label = i11 - Integer.MIN_VALUE;
                AuthorSubpagePagingSource$load$1 authorSubpagePagingSource$load$12 = authorSubpagePagingSource$load$1;
                Object obj = authorSubpagePagingSource$load$12.result;
                i10 = authorSubpagePagingSource$load$12.label;
                String str = null;
                if (i10 == 0) {
                    if (i10 == 1) {
                        a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    a.g(obj);
                    String str2 = (String) j1Var.a();
                    int i12 = j1Var.f32631a;
                    AuthorService authorService = this.authorService;
                    String str3 = this.authorId;
                    String str4 = this.subpageId;
                    Integer num = new Integer(i12);
                    String str5 = this.sortKey;
                    authorSubpagePagingSource$load$12.L$0 = null;
                    authorSubpagePagingSource$load$12.L$1 = null;
                    authorSubpagePagingSource$load$12.I$0 = i12;
                    authorSubpagePagingSource$load$12.label = 1;
                    obj = authorService.getAuthorSubpage(str3, str4, str2, num, str5, authorSubpagePagingSource$load$12);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                asyncCallResult = (AsyncCallResult) obj;
                if (!(asyncCallResult instanceof AsyncCallResult.Success)) {
                    PageData pageData = (PageData) ((AsyncCallResult.Success) asyncCallResult).getData();
                    List items = pageData.getItems();
                    if (pageData.getHasMore()) {
                        str = pageData.getNextCursor();
                    }
                    return new l1(str, items);
                }
                if (asyncCallResult instanceof AsyncCallResult.Error) {
                    return new k1(new Exception(((AsyncCallResult.Error) asyncCallResult).getError().toString()));
                }
                c6.p();
                return null;
            }
        }
        authorSubpagePagingSource$load$1 = new AuthorSubpagePagingSource$load$1(this, cVar);
        AuthorSubpagePagingSource$load$1 authorSubpagePagingSource$load$122 = authorSubpagePagingSource$load$1;
        Object obj2 = authorSubpagePagingSource$load$122.result;
        i10 = authorSubpagePagingSource$load$122.label;
        String str6 = null;
        if (i10 == 0) {
        }
        asyncCallResult = (AsyncCallResult) obj2;
        if (!(asyncCallResult instanceof AsyncCallResult.Success)) {
        }
    }

    public /* synthetic */ AuthorSubpagePagingSource(AuthorService authorService, String str, String str2, String str3, int i10, f fVar) {
        this(authorService, str, str2, (i10 & 8) != 0 ? null : str3);
    }
}
