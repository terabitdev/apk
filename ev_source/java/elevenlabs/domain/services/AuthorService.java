package io.elevenlabs.domain.services;

import a9.a;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.AuthorProfileSection;
import io.elevenlabs.domain.model.PageData;
import ir.i;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJP\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00052\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0013\u0010\bJ\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00052\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0014\u0010\b¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/AuthorService;", "", "", "authorId", "Lir/i;", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/model/AuthorProfile;", "getAuthorProfile", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "subpageId", "cursor", "", "pageSize", "sortKey", "Lio/elevenlabs/domain/model/PageData;", "Lio/elevenlabs/domain/model/AuthorProfileSection;", "getAuthorSubpage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lsn/z;", "followAuthor", "unfollowAuthor", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface AuthorService {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getAuthorSubpage$default(AuthorService authorService, String str, String str2, String str3, Integer num, String str4, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                str3 = null;
            }
            if ((i10 & 8) != 0) {
                num = null;
            }
            if ((i10 & 16) != 0) {
                str4 = null;
            }
            return authorService.getAuthorSubpage(str, str2, str3, num, str4, cVar);
        }
        a.y("Super calls with default arguments not supported in this target, function: getAuthorSubpage");
        return null;
    }

    Object followAuthor(String str, c<? super AsyncCallResult<z>> cVar);

    Object getAuthorProfile(String str, c<? super i> cVar);

    Object getAuthorSubpage(String str, String str2, String str3, Integer num, String str4, c<? super AsyncCallResult<PageData<AuthorProfileSection>>> cVar);

    Object unfollowAuthor(String str, c<? super AsyncCallResult<z>> cVar);
}
