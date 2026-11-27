type AvatarUser = {
  username?: string;
  userId?: string;
  avatar?: string | null;
  displayAvatar?: string | null;
};

const previousAdminPhoto = "https://static.deepseek.com/user-avatar/G_6cuD8GbD53VwGRwisvCsZ6";
const previousLoginFallback = "https://avatars.githubusercontent.com/u/583231?v=4";

export function userAvatarUrl(user?: AvatarUser | null): string | undefined {
  if (!user) return undefined;

  if (user.username !== "admin") {
    return user.avatar?.trim() || user.displayAvatar?.trim() || "/avatars/employee-default.png";
  }

  const photo = user.displayAvatar?.trim() || user.avatar?.trim();
  const legacyFallback = user.userId && photo === previousLoginFallback;
  if (photo && !legacyFallback && photo !== previousAdminPhoto) {
    return photo;
  }
  return "/avatars/admin.jpg";
}
