package io.elevenlabs.data.api;

import ct.b;
import ct.f;
import ct.o;
import ct.p;
import ct.s;
import ct.w;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.BodyCreateBookmarkBookmarksReadIdBookmarkPost;
import io.elevenlabs.data.model.BodyUpdateBookmarkBookmarksBookmarkIdPut;
import io.elevenlabs.data.model.response.BookmarkMarkdownResponseModel;
import io.elevenlabs.data.model.response.BookmarkResponseModel;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\rJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u000eH§@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\bJ \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0014\u0010\b¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/api/ReadBookmarksAPI;", "", "", "readId", "Lio/elevenlabs/data/model/ApiResult;", "", "Lio/elevenlabs/data/model/response/BookmarkResponseModel;", "getBookmarks", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "bookmarkId", "Lio/elevenlabs/data/model/BodyUpdateBookmarkBookmarksBookmarkIdPut;", "body", "updateBookmarkBookmarksBookmarkIdPut", "(Ljava/lang/String;Lio/elevenlabs/data/model/BodyUpdateBookmarkBookmarksBookmarkIdPut;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/model/BodyCreateBookmarkBookmarksReadIdBookmarkPost;", "createBookmark", "(Ljava/lang/String;Lio/elevenlabs/data/model/BodyCreateBookmarkBookmarksReadIdBookmarkPost;Lwn/c;)Ljava/lang/Object;", "Lsn/z;", "deleteBookmark", "Lio/elevenlabs/data/model/response/BookmarkMarkdownResponseModel;", "downloadBookmarksMarkdown", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface ReadBookmarksAPI {
    @o("/v1/reader/bookmarks/{read_id}/bookmark")
    Object createBookmark(@s("read_id") String str, @ct.a BodyCreateBookmarkBookmarksReadIdBookmarkPost bodyCreateBookmarkBookmarksReadIdBookmarkPost, c<? super ApiResult<BookmarkResponseModel>> cVar);

    @b("/v1/reader/bookmarks/{bookmark_id}")
    Object deleteBookmark(@s("bookmark_id") String str, c<? super ApiResult<z>> cVar);

    @w
    @f("/v1/reader/bookmarks/{read_id}/markdown")
    Object downloadBookmarksMarkdown(@s("read_id") String str, c<? super ApiResult<BookmarkMarkdownResponseModel>> cVar);

    @f("/v1/reader/bookmarks/{read_id}")
    Object getBookmarks(@s("read_id") String str, c<? super ApiResult<List<BookmarkResponseModel>>> cVar);

    @p("/v1/reader/bookmarks/{bookmark_id}")
    Object updateBookmarkBookmarksBookmarkIdPut(@s("bookmark_id") String str, @ct.a BodyUpdateBookmarkBookmarksBookmarkIdPut bodyUpdateBookmarkBookmarksBookmarkIdPut, c<? super ApiResult<BookmarkResponseModel>> cVar);
}
