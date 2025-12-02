class Solution:
    def updateMatrix(self, mat: List[List[int]]) -> List[List[int]]:
        n = len(mat)
        m = len(mat[0])
        vis = [[False for _ in range(m)] for _ in range(n)]
        ans = [[-1 for _ in range(m)] for _ in range(n)]
        q = deque()

        for i in range(n):
            for j in range(m):
                if(mat[i][j] == 0):
                    vis[i][j] = True
                    q.append((i,j,0))
        dirs = [[0,-1],[0,1],[1,0],[-1,0]]
        while q:
            x,y,dist = q.popleft()
            ans[x][y] = dist
            for dx,dy in dirs:
                nx = x+dx
                ny = y+dy
                if(0<=nx<n and 0<=ny<m and not vis[nx][ny]):
                    q.append((nx,ny, 1+ dist))
                    vis[nx][ny] = True
        return ans
